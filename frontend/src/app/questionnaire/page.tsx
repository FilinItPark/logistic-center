'use client'

import {Card, CardContent, CardHeader, CardTitle} from "@/components/ui/card";
import {Input} from "@/components/ui/input";
import {useState} from "react";
import { Check, ChevronsUpDown } from "lucide-react"

import { cn } from "@/lib/utils"
import { Button } from "@/components/ui/button"
import {
    Command,
    CommandEmpty,
    CommandGroup,
    CommandInput,
    CommandItem,
    CommandList,
} from "@/components/ui/command"
import {
    Popover,
    PopoverContent,
    PopoverTrigger,
} from "@/components/ui/popover"

const inputs = [
    {
        placeHolder: "Ваше полное имя",
        inputType: "text"
    },
    {
        placeHolder: "Ваш логин",
        inputType: "text"
    },
    {
        placeHolder: "Ваша электронная почта",
        inputType: "email"
    },

]
const languages = [
    {
        value: "ru",
        label: "Русский",
    },
    {
        value: "en",
        label: "Английский",
    },
]



const Questionnaire = () => {
    const [open, setOpen] = useState(false)
    const [value, setValue] = useState("")


    return (
        <div>
            <CardTitle>Маленький опрос для получения доп информации о вас</CardTitle>
            <CardContent className={"pt-5"}>
                {inputs.map((input, index) => (
                        <Input
                            className={"mt-5 mb-5"}
                            key={index} placeholder={input.placeHolder} type={input.inputType}/>
                    )
                )
                }
                <Popover open={open} onOpenChange={setOpen}>
                    <PopoverTrigger asChild>
                        <Button
                            variant="outline"
                            role="combobox"
                            aria-expanded={open}
                            className="w-[200px] justify-between"
                        >
                            {value
                                ? languages.find((language) => language.value === value)?.label
                                : "Select language..."}
                            <ChevronsUpDown className="ml-2 h-4 w-4 shrink-0 opacity-50" />
                        </Button>
                    </PopoverTrigger>
                    <PopoverContent className="w-[200px] p-0">
                        <Command>
                            <CommandInput placeholder="Search language..." />
                            <CommandList>
                                <CommandEmpty>No language found.</CommandEmpty>
                                <CommandGroup>
                                    {languages.map((language) => (
                                        <CommandItem
                                            key={language.value}
                                            value={language.value}
                                            onSelect={(currentValue) => {
                                                setValue(currentValue === value ? "" : currentValue)
                                                setOpen(false)
                                            }}
                                        >
                                            <Check
                                                className={cn(
                                                    "mr-2 h-4 w-4",
                                                    value === language.value ? "opacity-100" : "opacity-0"
                                                )}
                                            />
                                            {language.label}
                                        </CommandItem>
                                    ))}
                                </CommandGroup>
                            </CommandList>
                        </Command>
                    </PopoverContent>
                </Popover>

                <Button className={'flex mt-5'}>Сохранить результат</Button>
            </CardContent>
        </div>
    )
}

export default (Questionnaire);
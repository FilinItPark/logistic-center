'use client'

import {sidebarVars} from '@/components/side-bar/sidebarVars'
import {Button} from '@/components/ui/button'
import {getTokens, getUserRole} from '@/utils/token'
import Link from 'next/link'
import {usePathname} from 'next/navigation'

const isRouteActive = (pathname: string, url: string) => {
    return pathname.includes(url)
}
const SideBar = () => {
    const pathName = usePathname()

    const tokens = getTokens()

    const isTokensExists = Object.keys(tokens).length > 0
    const path = sidebarVars &&
        sidebarVars[getUserRole() as string]

    return (
        isTokensExists && Object.keys(path).includes(pathName) && (
            <div className='w-[15rem] flex flex-col gap-5 mr-36'>
                {path[pathName].map((value, index) => (
                    <Link href={value.link} key={index}>
                        <Button
                            className='w-full'
                            variant={
                                isRouteActive(pathName, value.link) ? 'ghost' : 'outline'
                            }
                            key={index}
                        >
                            {value.text}
                        </Button>
                    </Link>
                ))}
            </div>
        )
    )
}

export default SideBar;

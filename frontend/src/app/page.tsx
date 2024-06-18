'use client'
import { Inter as FontSans } from 'next/font/google'
import './globals.css'

import { Button } from '@/components/ui/button'
import { cn } from '@/lib/utils'
import { authorise } from '@/utils/authorisationLogic'
import { signOut } from '@/utils/token'

const fontSans = FontSans({
	subsets: ['latin'],
	variable: '--font-sans',
})

export default function RootLayout() {
	return (
		<div
			className={cn(
				'min-h-screen bg-purple-800 font-sans antialiased flex flex-col justify-center items-center gap-5',
				fontSans.variable
			)}
		>
			<p>
				<Button
					className='hover:bg-blue-500 transition duration-200'
					onClick={authorise}
				>
					Авторизоваться
				</Button>
			</p>
			<p>
				<Button className='hover:bg-blue-500 transition duration-200'>
					Создать аккаунт
				</Button>
			</p>
			<p>
				<Button
					className='hover:bg-blue-500 transition duration-200'
					onClick={signOut}
				>
					Выйти
				</Button>
			</p>
		</div>
	)
}

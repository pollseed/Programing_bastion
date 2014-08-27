"====カラー====
syntax on
set cursorline
set hlsearch
set t_Co=256
highlight Comment ctermfg=DarkCyan

"====表示文字====
set number
set notitle
set titlestring=haru
set autoindent

"completeoptの背景色をグレーにする
highlight Pmenu ctermbg=8
highlight PmenuSel ctermbg=Green
highlight PmenuSbar ctermbg=Green


"文字コード表示
"set statusline+=[%{has('multi_byte')&&\&fileencoding!=''?&fileencoding:&encoding}]

"現在文字行/全体行表示
set statusline+=[L=%l/%L]

"====編集時====
set showmatch

"自動インデント
set smartindent

"マウス許可
set mouse=a

"コマンド表示
set showcmd

set cmdheight=2
set tabstop=2

"複数ファイル編集
set hidden

"検索
set wrapscan

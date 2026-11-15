cmake_minimum_required(VERSION 3.22.1)
project("terminal")

set(CMAKE_C_STANDARD 17)
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_C_STANDARD_REQUIRED ON)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_compile_options(
    -Wall -Wextra -Werror
    -O3
    -fno-stack-protector
    -flto
)

add_link_options(
    -Wl,--gc-sections
    -Wl,-s
    -flto
)

add_library(pty SHARED
    pty.cpp
)

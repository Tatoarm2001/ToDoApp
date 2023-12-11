package com.proyectsfromzero.proyecto6todolist

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false)
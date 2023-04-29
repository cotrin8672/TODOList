package com.cotrin.todolist

enum class TaskCategory(val categoryName: String, val iconResId: Int) {
    OTHER("カテゴリ無し", R.drawable.task_category_other),
    WORK("課題", R.drawable.task_category_work),
    MEDICINE("お薬", R.drawable.task_category_medicine),
    CHORES("家事", R.drawable.task_category_chores),
    SHOPPING("買い物", R.drawable.task_category_shopping),
    PAYMENT("支払い", R.drawable.task_category_payment),
    CODING("コーディング", R.drawable.task_category_coding),
    SPORTS("スポーツ", R.drawable.task_category_sports),
    EVENT("イベント", R.drawable.task_category_event)
}
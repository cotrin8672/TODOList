package com.cotrin.todolist.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cotrin.todolist.ReminderInterval
import com.cotrin.todolist.RepeatInterval
import com.cotrin.todolist.SubTask
import com.cotrin.todolist.Task
import com.cotrin.todolist.TaskCategory
import com.cotrin.todolist.utils.Reference
import java.time.LocalDate
import java.time.LocalTime
import java.util.UUID

class TaskDetailViewModel: ViewModel() {
    val name = MutableLiveData("")
    val date = MutableLiveData(LocalDate.now())
    val time = MutableLiveData(LocalTime.now())
    val category = MutableLiveData(TaskCategory.OTHER)
    val remind = MutableLiveData(ReminderInterval.NONE)
    val repeat = MutableLiveData(RepeatInterval.NONE)
    val carryover = MutableLiveData(false)

    fun getTimeText(): String {
        return time.value?.format(Reference.TIME_FORMATTER) ?: run { "**:**" }
    }
}
package com.example.coursesapp.data

import androidx.compose.ui.res.stringResource
import com.example.coursesapp.R

class DataResources() {
    fun loadCourse():List<Course>{
        return listOf<Course>(
            Course(R.drawable.architecture, R.string.architecture, 58, R.drawable.baseline_dialpad_24),
            Course(R.drawable.automotive, R.string.automotive, 30, R.drawable.baseline_dialpad_24),
            Course(R.drawable.biology, R.string.biology, 90, R.drawable.baseline_dialpad_24),
            Course(R.drawable.business, R.string.business, 121, R.drawable.baseline_dialpad_24),
            Course(R.drawable.crafts, R.string.crafts, 78, R.drawable.baseline_dialpad_24),
            Course(R.drawable.culinary, R.string.culinary, 118, R.drawable.baseline_dialpad_24),
            Course(R.drawable.design, R.string.design, 423, R.drawable.baseline_dialpad_24),
            Course(R.drawable.drawing, R.string.drawing, 28, R.drawable.baseline_dialpad_24),
            Course(R.drawable.ecology, R.string.ecology, 67, R.drawable.baseline_dialpad_24),
            Course(R.drawable.engineering, R.string.engineering, 92, R.drawable.baseline_dialpad_24),
            Course(R.drawable.fashion, R.string.fashion, 100, R.drawable.baseline_dialpad_24),
            Course(R.drawable.film, R.string.film, 165, R.drawable.baseline_dialpad_24),
            Course(R.drawable.finance, R.string.finance, 37, R.drawable.baseline_dialpad_24),
            Course(R.drawable.gaming, R.string.gaming, 290, R.drawable.baseline_dialpad_24),
            Course(R.drawable.geology, R.string.geology, 326, R.drawable.baseline_dialpad_24),
            Course(R.drawable.history, R.string.history, 189, R.drawable.baseline_dialpad_24),
            Course(R.drawable.journalism, R.string.journalism, 96, R.drawable.baseline_dialpad_24),
            Course(R.drawable.law, R.string.law, 58, R.drawable.baseline_dialpad_24),
            Course(R.drawable.lifestyle, R.string.lifestyle, 305, R.drawable.baseline_dialpad_24),
            Course(R.drawable.music, R.string.music, 212, R.drawable.baseline_dialpad_24),
            Course(R.drawable.painting, R.string.painting, 172, R.drawable.baseline_dialpad_24),
            Course(R.drawable.photography, R.string.photography, 321, R.drawable.baseline_dialpad_24),
            Course(R.drawable.physics, R.string.physics, 41, R.drawable.baseline_dialpad_24),
            Course(R.drawable.tech, R.string.tech, 118, R.drawable.baseline_dialpad_24),

        )
    }
}
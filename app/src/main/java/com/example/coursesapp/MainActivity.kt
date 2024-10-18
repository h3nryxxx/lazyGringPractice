package com.example.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursesapp.data.Course
import com.example.coursesapp.data.DataResources
import com.example.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CoursesApp()
                }
            }
        }
    }
}

@Composable
fun CoursesApp(){
    CoursesList(courseList = DataResources().loadCourse())
}

@Composable
fun CoursesCard(course: Course, modifier: Modifier = Modifier){
    Card(modifier = modifier){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(68.dp)
        ){
            Image(
                painter = painterResource(id = course.imageResourceId),
                contentDescription = stringResource(id = course.stringResourceId),
                modifier = Modifier.size(height = 68.dp, width = 68.dp)
            )
            Column {
                Text(
                    text = stringResource(id = course.stringResourceId),
                    modifier = Modifier
                        .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 8.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
                Row(horizontalArrangement = Arrangement.Center){

                    Icon(
                        painter = painterResource(id = course.iconResourceId),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 16.dp, end = 8.dp, bottom = 8.dp)
                    )
                    Text(
                        text = "${course.coursesAmount}",
                        modifier = Modifier
                            .padding(top = 4.dp, bottom = 4.dp),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
        }
    }
}

@Composable
fun CoursesList(courseList: List<Course>,modifier: Modifier = Modifier){
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(courseList){ course ->
            CoursesCard(
                course = course,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CoursesPreview(){
    Surface(
        modifier = Modifier.padding(4.dp)
    ){

        CoursesCard(course = Course(R.drawable.architecture, R.string.architecture,333 , R.drawable.baseline_dialpad_24))
    }
}

/*
* recursos:
* imagen: Image()
* nombre: Text()
* cantidad Cursos: Int
* icono: Icon()
*
* */
package ru.stambul4you.recyclerviewitdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import ru.stambul4you.recyclerviewitdev.adapter.UserAdapter
import ru.stambul4you.recyclerviewitdev.databinding.ActivityMainBinding
import ru.stambul4you.recyclerviewitdev.model.UserModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initial()
    }

    private fun initial() {
        recyclerView = binding.rvUser
        adapter = UserAdapter(this)
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel>{
        val userList = ArrayList<UserModel>()

        val user = UserModel("Petrov","Vasya")
        userList.add(user)

        val user2 = UserModel("Ivanov","Petr")
        userList.add(user2)

        val user3 = UserModel("Sidorov","Nikolay")
        userList.add(user3)

        val user4 = UserModel("Nikonov","Anton")
        userList.add(user4)



        return userList

    }

}


import android.util.Log

class View : ViewModelCallback {

    init {

        val viewModel = ViewModel(this)
        viewModel.loadData()

    }

    override fun onDataFetched(users: List<UserDataClass>) {

        users.forEach { Log.i("TEST","${it.name} : ${it.family}") }

    }

}
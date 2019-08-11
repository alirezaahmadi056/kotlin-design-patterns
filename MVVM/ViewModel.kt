
class ViewModel(private val viewModelCallback: ViewModelCallback) : ModelCallback {

    fun loadData() {

        val model = Model()
        // Load progress
        model.getData(this)

    }

    override fun onDataFetched(users: List<UserDataClass>) {

        viewModelCallback.onDataFetched(users)
        // Hide progress

    }

}

interface ViewModelCallback {

    fun onDataFetched(users: List<UserDataClass>)

}
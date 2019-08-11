
class Model {

    fun getData(modelCallback: ModelCallback) {

        val users = listOf(
            UserDataClass("name1", "family1"),
            UserDataClass("name2", "family2"),
            UserDataClass("name3", "family3"),
            UserDataClass("name4", "family4")
        )

        modelCallback.onDataFetched(users)

    }

}

interface ModelCallback {

    fun onDataFetched(users: List<UserDataClass>)

}
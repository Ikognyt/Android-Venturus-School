package com.vntfian.trilhasoftex.class6

class Repository(
    user1: User = User("Um", ""),
    user2: User = User("Dois", ""),
    user3: User = User("Tres", ""),
    users: ArrayList<User> = ArrayList()
) {

    val users = users

    init {
        users.add(user1)
        users.add(user2)
        users.add(user3)
    }



    companion object {
        private lateinit var INSTANCE: Repository
        fun getInstance(): Repository {
            synchronized(Repository::class) {
                INSTANCE = Repository()
            }
            return INSTANCE
        }
    }

    fun getFormattedUserNames() : List<String> {
        val userNames: List<String> = ArrayList(users.size)

        for(user in users){

            val name = "${user.firstName} ${user.lastName}"
            userNames as ArrayList
            userNames.add(name)
        }

        return userNames
    }

}
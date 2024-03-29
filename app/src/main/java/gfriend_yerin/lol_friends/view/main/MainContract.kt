package gfriend_yerin.lol_friends.view.main

import gfriend_yerin.lol_friends.data.value_object.LeagueVO
import gfriend_yerin.lol_friends.data.value_object.PlayInfoVO
import gfriend_yerin.lol_friends.data.value_object.PlayerVO

interface MainContract {

    interface View{
        fun updateEntries(entries : List<PlayInfoVO>)
        fun updateUserProfile(player : PlayerVO?)
        fun updateUserRank(ranks : List<LeagueVO>)
    }

    interface Presenter{
        fun setView(view : View)
        fun updateUser(name : String)
    }
}
package com.example.netflixuiclone.data

object setData {
    fun movieList(): List<MovieData> {
        var list = mutableListOf<MovieData>()

        list.add(
            MovieData(

                1,
                "The Batman",
                "Acton/Crime/Drama",
                "2022",
                "2h 56m",
                "Matt Reeves",
                "When a sadistic serial killer begins murdering key political figures in Gotham, Batman is forced to investigate the city's hidden corruption and question his family's involvement.",
                "https://www.themoviedb.org/t/p/original/seyWFgGInaLqW7nOZvu0ZC95rtx.jpg"
            )
        )

        list.add(
            MovieData(
                2,
                "Morbius",
                "Action/Adventure",
                "2022",
                "1h44m",
                "Daniel Espinosa",
                "Biochemist Michael Morbius tries to cure himself of a rare blood disease, but he inadvertently infects himself with a form of vampirism instead.",
                "https://www.themoviedb.org/t/p/original/6JjfSchsU6daXk2AKX8EEBjO3Fm.jpg"
            )
        )

        list.add(
            MovieData(
                3,
                "Dual",
                "comedy, drama",
                "2022",
                "length",
                "Riley Stearns",
                "A woman opts for a cloning procedure after she receives a terminal diagnosis but when she recovers her attempts to have her clone decommissioned fail, leading to a court-mandated",
                "https://www.themoviedb.org/t/p/original/wDEse2TQRiyfhdlusSXBdkDOQRj.jpg"
            )
        )

        list.add(
            MovieData(

            )
        )


        return list
    }
}
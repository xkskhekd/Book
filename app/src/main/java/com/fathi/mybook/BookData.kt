package com.fathi.mybook

object BookData {
    private val bookNames = arrayOf("A Brief History of Time",
        "Cinta Dalam 99 NamaMu",
        "Fiesta",
        "Gulag",

        "Homo Deus",
        "21 Lessons for the 21st Century",
        "I Want to Eat Your Pancreas")

    private val bookDetails = arrayOf("A Brief History of Time is one of Hawking's most famous works. In his book he attempts to answer big questions such as: how did the universe begin and what started it? What is time? Is it always moving forward?",
        "Cinta Dalam 99 NamaMu is the fifty-fifth book of Asma Nadia. Arum and Alif are caught in a path that is completely far from the desire, but in the end they love with all their soul. Arum who had been fighting death all his life, and Alif who was trapped in silence, slowly fall in love with the beautiful names of the Creator. Although life is like a long story with some unexpected plots, they believe that the end of the journey lies in His 99 names.",
        "In the book Homo Deus, Yuval Noah Harari explains about human civilization at this time as well as human civilization in the previous 100 years. According to Yuval Noah Harari, humans are able to overcome three problems in their lives, namely hunger, disease outbreaks and war conditions in ancient times.",
        "Yuval Noah Harari through his book 21 Lessons for 21st Century discusses the most pressing global problems today. At this point humanity faces an inevitable challenge as a result of their self-made progress.",
        "I am a high school student. I found the diary of my classmate, Sakura Yamauchi, who turned out to have pancreatic cancer. I spent time with Sakura before she died. 12 years later, because of Sakura's words, I became a teacher at my alma mater.")

    private val bookImages = intArrayOf(R.drawable.brief_history,
        R.drawable.cinta_namamu,
        R.drawable.homo_deus,
        R.drawable.lessons_century,
        R.drawable.your_pancreas)

    val listData: ArrayList<Book>
        get() {
            val list = arrayListOf<Book>()
            for (position in bookNames.indices) {
                val book = Book()
                book.title = bookNames[position]
                book.detail = bookDetails[position]
                book.psd = bookImages[position]
                list.add(book)
            }
            return list
        }
}
package exercise

object States {
  private val states = Map(
    "Alabama" -> "Montgomery",
    "Alaska" -> "Juneau",
    "Arizona" -> "Phoenix",
    "Arkansas" -> "Little Rock",
    "California" -> "Sacramento",
    "Colorado" -> "Denver",
    "Connecticut" -> "Hartford",
    "Delaware" -> "Dover",
    "Florida" -> "Tallahassee",
    "Georgia" -> "Atlanta",
    "Hawaii" -> "Honolulu",
    "Idaho" -> "Boise",
    "Illinois" -> "Springfield",
    "Indiana" -> "Indianapolis",
    "Iowa" -> "Des Moines",
    "Kansas" -> "Topeka",
    "Kentucky" -> "Frankfort",
    "Louisiana" -> "Baton Rouge",
    "Maine" -> "Augusta",
    "Maryland" -> "Annapolis",
    "Massachusetts" -> "Boston",
    "Michigan" -> "Lansing",
    "Minnesota" -> "Saint Paul",
    "Mississippi" -> "Jackson",
    "Missouri" -> "Jefferson City",
    "Montana" -> "Helena",
    "Nebraska" -> "Lincoln",
    "Nevada" -> "Carson City",
    "New Hampshire" -> "Concord",
    "New Jersey" -> "Trenton",
    "New Mexico" -> "Santa Fe",
    "New York" -> "Albany",
    "North Carolina" -> "Raleigh",
    "North Dakota" -> "Bismarck",
    "Ohio" -> "Columbus",
    "Oklahoma" -> "Oklahoma City",
    "Oregon" -> "Salem",
    "Pennsylvania" -> "Harrisburg",
    "Rhode Island" -> "Providence",
    "South Carolina" -> "Columbia",
    "South Dakota" -> "Pierre",
    "Tennessee" -> "Nashville",
    "Texas" -> "Austin",
    "Utah" -> "Salt Lake City",
    "Vermont" -> "Montpelier",
    "Virginia" -> "Richmond",
    "Washington" -> "Olympia",
    "West Virginia" -> "Charleston",
    "Wisconsin" -> "Madison",
    "Wyoming" -> "Cheyenne"
  )

  def printStates(): Unit = {
    println("STATES:\n=======")
    states.keys.toList.sorted.foreach(println)
    println()
  }

  def printCapitals(): Unit = {
    println("CAPITALS:\n=======")
    states.keys.toList.sorted.foreach(key => println(states(key)))
    println()
  }

  def printStateWithCapital(): Unit = {
    println("STATE -> CAPITAL:\n=======")
    states.keys.toList.sorted.foreach(key => println(s"$key -> ${states(key)}"))
    println()
  }
  //Write a Scala program based on the below instructions.

  //a) Create a Map to hold the names of all the states and their corresponding
  //capital names. (State name is the key, and the capital name is the value.)

  //b) Load the Map with each state/capital pair. (This should be hard-coded.)

  //c) Print all of the state names to the screen. (Hint: Get the keys from the
  //map and then print each state name one by one.)

  //d) Print all of the capital names on the screen. (Hint: Get the values from the
  //map and then print each capital name to the screen one by one.)

  //e) Print each state along with its capital to the screen. (Hint: Use the key set
  //to get each value from the map one by one, printing both the key and
  //value as you go.).

  //Sample Output
  //STATES:
  //=======
  //Alabama
  //Alaska
  //Arizona
  //Arkansas
  //…
  //…
  //CAPITALS:
  //=========
  //Montgomery
  //Juneau
  //Phoenix
  //Little Rock
}

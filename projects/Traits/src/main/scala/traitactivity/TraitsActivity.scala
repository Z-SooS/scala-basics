package traitactivity

import traitactivity.subtask.car.VehicleActivity
import traitactivity.subtask.pastry.PastryShop

object TraitsActivity {
  def main(args: Array[String]): Unit = {
    VehicleActivity.runActivity()

    PastryShop.runExercise()
  }

}

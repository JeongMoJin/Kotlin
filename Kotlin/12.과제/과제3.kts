open class Warrior constructor(var hp:Int, var power:Int, var armor:Int) {
    fun attack(monster: Monster) {
        println("Warrior가 공격을 합니다.")
        monster.defense(this)
    }
    fun defense() {

    }
    fun levelUp(): Night{

    }
}

class Knight : Warrior() {}

class Monster(hp:Int, var power:Int, var armor:Int) {
    var isAlive: Boolean = true
        get() {
            if (field == true) println("Monster는 아직 살아있다. 체력: ${this.hp}")
            else println("Monster는 죽었습니다")
            return field
        }
    var hp : Int = 100
        set(value) {
            if (value <= 0) {
                field = 0
                this.isAlive = false
            } else field = value
        }
    init {
        this.hp = hp
    }

    fun attack(monster: Monster) {
        println("Warrior가 공격을 합니다.")
    }
    fun defense(warrior: Warrior) : Boolean {
        val damege: Int = Warrior.power - this.armor
        this.hp -= if(damege > 0) damege else 0
    }
}









fun main() {


}
interface Virus{
    fun mutate()
    fun spread()
}
enum class VirusType{
    corona,
    influenza,
    HIV

}
class CoronaVirus:Virus{
    override fun mutate() {

    }
    override fun spread() {

    }

}
class InfluenzaVirus:Virus{
    override fun mutate() {

    }
    override fun spread() {

    }

}
class HIVVirus:Virus{
    override fun mutate() {
    }
    override fun spread() {

    }

}
class VirusFactory{


    fun makeVirus(virusType:VirusType):Virus{
        var  type:Virus?
        if(virusType==VirusType.corona)
            type= CoronaVirus()
        else if(virusType==VirusType.influenza)
            type=InfluenzaVirus()
        else type=HIVVirus()
        return type;


    }
}


class Animal:
    sonido: str

    def __init__(self):
        sonido = "Sonido no definido"

    def vocalizar(self):
        print(f"{self.sonido=}") 

class Mascota:
    nombreMascota: str

    def __init__(self):
        pass

    def nombre(self):
        return self.nombreMascota
    
    def nombrar(self, nombre: str):
        self.nombreMascota = nombre



def main():
    miPerro = Mascota()
    miPerro.nombrar("Inti")
    

    print("Mi perro se llama: " + miPerro.nombre())


if __name__ == "__main__":
    main()

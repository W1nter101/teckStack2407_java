import java.util.Scanner;

public class AnimalManager {
        private Animal[] animals;
        private int currentAnimalIndex;
        private int totalAnimals;
        private final int DEFAULT_NEW_SIZE = 10;

        public AnimalManager(int totalAnimals)
        {
            this.totalAnimals = totalAnimals;
            animals = new Animal[totalAnimals];
        }
        public void addAnimal(){
            System.out.println("nhap vao loai dong vat: ");
            int type = 0;
            do {
                System.out.println("1: lion");
                System.out.println("2: Elephant");
                System.out.println("3: Monkey");
                System.out.println("4: Dung nhap");
                type = new Scanner(System.in).nextInt();
                Animal animal = null;
                switch (type){
                    case 1:
                        animal = new Lion();
                        break;
                    case 2:
                        animal = new Elephant();
                        break;
                    case 3:
                        animal = new Monkey();
                        break;
                    case 4:
                        System.out.println("Dung nhap");
                        break;
                    default:
                        System.out.println("invalid type, type again");
                        type = 1;
                }
                if(animal != null){
                    animal.enterInfo();
                    resizeArray();
                    this.animals[currentAnimalIndex] = animal;
                    currentAnimalIndex++;
                }
            }while(type < 4);
        }
        public void resizeArray(){
            //mo rong mang
            if(currentAnimalIndex == totalAnimals){
                this.totalAnimals = this.totalAnimals + DEFAULT_NEW_SIZE;
                //copy lai mang sang mang moi
                this.animals = copyArray(totalAnimals, this.animals);
            }
        }
        public Animal[] copyArray(int newSize, Animal[] oldArray){
            Animal[] newAnimals = new Animal[newSize];
            for(int i = 0; i < oldArray.length; i++){
                newAnimals[i] = oldArray[i];
            }
            return newAnimals;
        }

        public void showAllAnimals(){
            for(int i = 0; i < currentAnimalIndex; i++){
                if(animals[i] != null){
                    System.out.println("--------------------");
                    animals[i].showInfo();
                }
                else{
                    continue;
                }
            }
        }
        public void search(){
            System.out.println("Nhap ten dong vat can tim: ");
            String tim = new Scanner(System.in).nextLine();
            for(int i = 0; i < currentAnimalIndex; i++){
                if(!tim.equalsIgnoreCase(animals[i].getName())){
                    continue;
                }
                animals[i].showInfo();
            }
            this.currentAnimalIndex--;
        }
        public void delete(){
            System.out.println("Nhap ten dong vat can xoa: ");
            String xoa = new Scanner(System.in).nextLine();
            for(int i = 0; i < currentAnimalIndex; i++){
                if(!xoa.equalsIgnoreCase(animals[i].getName())){
                    continue;
                }
                for(int j = i; j < currentAnimalIndex; j++){
                    if(j != currentAnimalIndex -1){
                        animals[j] = null;
                    }
                    else{
                        animals[j] = this.animals[j+1];
                    }
                }
            }
        }

}

package composite;

public class Main {
    public static void main(String[] args) {

        Composite motherboard = new Composite("Motherboard");
        Composite processor = new Composite("Processor");
        Leaf cpu = new Leaf("cpu", 129, 100);
        processor.add(cpu);

        Composite memory = new Composite("Memory");
        Leaf ram1 = new Leaf("ram", 79, 50);
        Leaf ram2 = ram1;
        memory.add(ram1);
        memory.add(ram2);

        motherboard.add(processor);
        motherboard.add(memory);

        System.out.println(motherboard.getPrice());
    }
}

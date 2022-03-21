package com.company;

public class Main {

    public static void main(String[] args) {
        public class Computer {

            private double cost;
            private String model;
            RAM ram;
            HDD hdd;

            public class HDD {

                private String name = "имя памяти не определено";
                private int memorySize = 0;
                private String type = "тип памяти не определен";

                private HDD() {
                }

                public HDD(String name, int memorySize, String type) {
                    this.name = name;
                    this.memorySize = memorySize;
                    this.type = type;
                }

                public String getName() {
                    return this.name;
                }

                public int getMemorySize() {
                    return this.memorySize;
                }

                public String getType() {
                    return this.type;
                }
            }

            private class RAM {

                private String name = "имя не определено";
                private int memorySize = 0;

                public RAM() {
                }

                public RAM(String name, int memorySize) {
                    this.name = name;
                    this.memorySize = memorySize;
                }

                public String getName() {
                    return this.name;
                }

                public int getMemorySize() {
                    return this.memorySize;
                }

            }

            public Computer(double cost, String model) {
                this.cost = cost;
                this.model = model;
                this.hdd = new HDD();
                this.ram = new RAM();
            }

            public Computer(double cost, String model, String ramName, int ramMemorySize, String hddName, int hddMemorySize, String hddType) {
                this.cost = cost;
                this.model = model;
                this.hdd = new HDD(hddName, hddMemorySize, hddType);
                this.ram = new RAM(ramName, ramMemorySize);
            }

            public double getCost() {
                return this.cost;
            }

            public String getModel() {
                return this.model;
            }

            public String ramGetName() {
                return this.ram.getName();
            }

            public int ramGetMemorySize() {
                return this.ram.getMemorySize();
            }

            public String hddGetName() {
                return this.hdd.getName();
            }

            public int hddGetMemorySize() {
                return this.hdd.getMemorySize();
            }

            public String hddGetType() {
                return this.hdd.getType();
            }
        }
    }
}


    class Rettangolo extends forma {
        private double base;
        private double altezza;

        public Rettangolo(double base, double altezza) {
            this.base = base;
            this.altezza = altezza;
        }

        @Override
        public void calcularArea() {
            double area = base * altezza;
            System.out.println(area);
        }
    }


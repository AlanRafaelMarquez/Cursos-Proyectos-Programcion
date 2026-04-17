package Ejercicio6;

public class NumeroComplejo {
        private double parteReal;
        private double parteImaginaria;

        public NumeroComplejo(double parteReal, double parteImaginaria) {
            this.parteReal = parteReal;
            this.parteImaginaria = parteImaginaria;
        }

        public NumeroComplejo sumar(NumeroComplejo otro) {
            return new NumeroComplejo(
                    this.parteReal + otro.parteReal,
                    this.parteImaginaria + otro.parteImaginaria
            );
        }

        public NumeroComplejo multiplicar(NumeroComplejo otro) {
            double real = this.parteReal * otro.parteReal - this.parteImaginaria * otro.parteImaginaria;
            double imaginaria = this.parteReal * otro.parteImaginaria + this.parteImaginaria * otro.parteReal;
            return new NumeroComplejo(real, imaginaria);
        }

        public boolean esIgual(NumeroComplejo otro) {
            return this.parteReal == otro.parteReal && this.parteImaginaria == otro.parteImaginaria;
        }

        public NumeroComplejo multiplicarPorEntero(int entero) {
            return new NumeroComplejo(this.parteReal * entero, this.parteImaginaria * entero);
        }

        public String mostrar() {
            return parteReal + " + " + parteImaginaria + "i";
        }

}

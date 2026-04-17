package Ejercicio2;

public class ObjetoMovil {
        private int x;
        private int y;

        public ObjetoMovil() {
            this.x = 0;
            this.y = 0;
        }

        public void mover(String direccion) {
            switch (direccion.toUpperCase()) {
                case "ARRIBA":
                    y++;
                    break;
                case "ABAJO":
                    y--;
                    break;
                case "DERECHA":
                    x++;
                    break;
                case "IZQUIERDA":
                    x--;
                    break;
                default:
                    System.out.println("Dirección no válida.");
                    return;
            }
            System.out.println("Dirección: " + direccion + " → Nueva posición: (" + x + ", " + y + ")");
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }


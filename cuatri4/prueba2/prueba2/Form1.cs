using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace prueba2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 nuevoForm = new Form2();  // Crear instancia de Form2
            nuevoForm.Show();               // Mostrar Form2
            this.Hide();                    // Ocultar Form1 (opcional)

        }
    }
}

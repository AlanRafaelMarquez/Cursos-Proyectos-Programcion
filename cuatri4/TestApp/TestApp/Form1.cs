using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TestApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
           
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            int numero1 = int.Parse(textBox1.Text);
            int numero2 = int.Parse(textBox2.Text);
            int resultado = numero2 + numero1;
            MessageBox.Show($"Hiciste una suma mi amor {resultado}");
            

            button1.BackColor = Color.MediumPurple;
            button1.ForeColor = Color.White;

         
            button1.Font = new Font("Comic Sans MS", 14, FontStyle.Bold | FontStyle.Italic);


        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            int numero1 = int.Parse(textBox1.Text);
            int numero2 = int.Parse(textBox2.Text);
            int resultado = numero2 - numero1;
            MessageBox.Show($"Hiciste una resta mi amor {resultado}");

            button4.BackColor = Color.MediumPurple;
            button4.ForeColor = Color.White;

           
            button4.Font = new Font("Comic Sans MS", 14, FontStyle.Bold | FontStyle.Italic);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            int numero1 = int.Parse(textBox1.Text);
            int numero2 = int.Parse(textBox2.Text);
            int resultado = numero2 * numero1;
            MessageBox.Show($"Hiciste una multiplicacion mi amor {resultado}");

            button3.BackColor = Color.MediumPurple;
            button3.ForeColor = Color.White;

          
            button3.Font = new Font("Comic Sans MS", 14, FontStyle.Bold | FontStyle.Italic);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int numero1 = int.Parse(textBox1.Text);
            int numero2 = int.Parse(textBox2.Text);
            int resultado = numero2 / numero1;
            MessageBox.Show($"Hiciste una division mi amor {resultado}");

            button2.BackColor = Color.MediumPurple;
            button2.ForeColor = Color.White;

            
            button2.Font = new Font("Comic Sans MS", 14, FontStyle.Bold | FontStyle.Italic);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";

            
            MessageBox.Show("Campos limpiados correctamente");

        }
    }
}

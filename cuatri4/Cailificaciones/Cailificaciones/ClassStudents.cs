using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cailificaciones
{
    public class ClassStudents
    {
        public string FirstNamed { get; set; }
        private string _LastNamed;

        public string LastNamed { get { return _LastNamed; } set { _LastNamed = value.ToUpper(); } }
        public double Grade { get; set; }
        public bool Aproved
        {
            get { return Grade >= 7; } 
        }
    }
}

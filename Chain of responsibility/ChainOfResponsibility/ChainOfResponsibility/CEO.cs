using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainOfResponsibility
{
    public class CEO : Handler
    {
        public override void HandleRequest(int request)
        {
            if (request > 4.99)
            {
                Console.WriteLine("Salary raised by CEO.");
            }
        }
    }
}

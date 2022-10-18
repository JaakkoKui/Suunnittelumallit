using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainOfResponsibility
{
    public class Boss : Handler
    {
        public override void HandleRequest(int request)
        {
            if (request > 1.99 && request < 4.99)
            {
                Console.WriteLine("Salary raised by boss.");
            }
            else if (successor != null)
            {
                successor.HandleRequest(request);
            }
        }
    }
}

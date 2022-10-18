using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace ChainOfResponsibility
{
    public class ImmediateSupervisor : Handler
    {
        public override void HandleRequest(int request)
        {
            if (request < 2) {
                Console.WriteLine("Salary raised by immediate supervisor.");
            }
            else if (successor != null)
            {
                successor.HandleRequest(request);
            }
        }
    }
}

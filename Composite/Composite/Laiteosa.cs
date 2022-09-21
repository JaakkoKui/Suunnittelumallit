using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Composite
{
    internal interface Laiteosa
    {
        abstract float Hinta { get; set; }
        abstract float getHinta();
        abstract void lisaaOsa(Laiteosa osa);  
    }
}





using ChainOfResponsibility;

class Program
{
    static void Main(string[] args)
    {
        int raiseWanted = 1;
        Handler immediateSupervisor = new ImmediateSupervisor();
        Handler boss = new Boss();
        Handler ceo = new CEO();
        immediateSupervisor.SetSuccessor(boss);
        boss.SetSuccessor(ceo);


        while (raiseWanted != 0)
        {
            Console.WriteLine("How big raise do you want?");
            raiseWanted = Convert.ToInt32(Console.ReadLine());
            immediateSupervisor.HandleRequest(raiseWanted);
        }
    }
}
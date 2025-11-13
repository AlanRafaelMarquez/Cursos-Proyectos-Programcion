using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using WebApplication2.Models;

namespace WebApplication2.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Hello()
        {
            Persons persons = new Persons()
            { Name = "Alex", Age = 30, height = 1.70}
            
            ;
            return View(persons);
        }


        [HttpPost("api/Perso")]

        public IActionResult Perso()
        {
            Persons persons = new Persons()
            { Name = "Mario", Age = 45, height = 1.80 }

            ;
            return Ok(persons);
        }
        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}

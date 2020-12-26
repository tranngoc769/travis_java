using NUnit.Framework;
using System;
using Triangle;
namespace Triangle.Test
{
    [TestFixture]
    public class TestDiem
    {
        private Diem _diem;
        [SetUp]
        public void Setup()
        {
            _diem = new Diem();
            _diem.setX(12);
            _diem.setY(12);
        }
        [Test]
        public void isNegativePointX()
        {
            Assert.Less(0, _diem.getX());
        }
        [Test]
        public void isNegativePointY()
        {
            Assert.Less(0, _diem.getY());
        }
    }

}

using System;
using System.Collections.Generic;
using System.Text;
using NUnit.Framework;
using Triangle;

[TestFixture]
public  class ProjectTriangleTest
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

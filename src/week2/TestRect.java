package week2;

public class TestRect {

    public class Rectangle {

        private double length;
        private double width;
        private int xAxis;
        private int yAxis;

        public void setX(int xAxis) {
            this.xAxis = xAxis;
        }

        public void setY(int yAxis) {
            this.yAxis = yAxis;
        }

        public void setLength(double length) {
            if(length >= 0)
                this.length = length;
        }

        public void setWidth(double width) {
            if(width >= 0)
                this.width = width;
        }

        public int getX() {
            return xAxis;
        }

        public int getY() {
            return yAxis;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        Rectangle(double length, double width, int xAxis, int yAxis) {
            setLength(length);
            setWidth(width);
            setX(xAxis);
            setY(yAxis);
        }

        public double rectArea() {
            return length * width;
        }

        public double rectCircumference() {
            return 2*(length + width);
        }


        // public Rectangle getMinRect(Rectangle r1, Rectangle r2) {
        //     if(r1.rectArea() > r2.rectArea())
        //     {
        //         return r1;
        //     }
        //     else
        //     {
        //         return r2;
        //     }
        // }


        public String getMinRect(Rectangle r1, Rectangle r2) {
            if(r1.rectArea() > r2.rectArea())
            {
                return "r1 is greater";
            }
            else
            {
                return "r2 is greater";
            }
        }

        // public void checkPosition(int xAxis, int yAxis) {
        //     double x1 = xAxis;
        //     double x2 = xAxis + length;
        //     double y1 = yAxis;
        //     double y2 = yAxis + width;

        // }

        // public String checkOverlap(Rectangle r1, Rectangle r2) {
        // if((((r1.xAxis+r1.length) > r2.xAxis) && (r1.xAxis < r2.xAxis)) && (((r1.yAxis+ r1.width) > r2.yAxis) && (r1.yAxis < r2.yAxis)))
        // {
        //     return "These rectangles are overlaping";
        // }
        // else if(((r2.xAxis+r2.length) < (r1.xAxis+r1.length)) && ((r2.yAxis+ r1.length) > r2.yAxis))
        // {
        //     return "These rectangles are overlaping";
        // }
        // }

        public String checkOverlap(Rectangle r1, Rectangle r2) {
            if((((r1.xAxis+r1.length) > r2.xAxis) && (r1.xAxis < r2.xAxis)) && (((r1.yAxis+ r1.width) > r2.yAxis) && (r1.yAxis < r2.yAxis)))
            {
                return "The rectangles are overlapping";
            }
            else if((r1.xAxis < (r2.xAxis+r2.length)) && ((r1.xAxis + r1.length)>(r2.xAxis + r2.length)) && (r1.yAxis < r2.yAxis) && ((r1.yAxis+r1.width)>r2.yAxis))
            {
                return "The rectangles are overlapping";
            }
            else if((r1.xAxis > r2.xAxis) && (r1.xAxis < (r2.xAxis+r2.length)) && (r1.yAxis > r2.yAxis) && (r1.yAxis < (r2.yAxis + r2.width)))
            {
                return "The rectangles are overlapping";
            }
            else if((r1.xAxis < r2.xAxis) && ((r1.xAxis+r1.length) > r2.xAxis) && ((r2.yAxis+r2.width) > r1.yAxis) && (r1.yAxis > r2.yAxis))
            {
                return "The rectangles are overlapping";
            }
            else
            {
                return "The rectangles are not overlapping";
            }
        }


    }

}

package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    private static final int CENTERX = 300;
    private static final int CENTERY = 300;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setAntiAlias(true);


        RectF rectF1 = new RectF(100, 100, 300, 300);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF1, -45, 45, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF1, 0, 10, true, paint);

        paint.setColor(Color.RED);
        canvas.drawArc(rectF1, 10, 30, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF1, 40, 50, true, paint);

        paint.setColor(Color.BLACK);
        canvas.drawArc(rectF1, 90, 90, true, paint);

        paint.setColor(Color.GRAY);
        RectF rectF2 = new RectF(90, 90, 300, 300);
        canvas.drawArc(rectF2, 180, 135, true, paint);
    }
}

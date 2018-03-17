package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();

    public static final int WIDTH = 30;
    public static final int LINE_BOTTOM = 200;
    public static final int SPACE_X = 10;
    Random random = new Random();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(1);

        canvas.drawLine(100, LINE_BOTTOM, 500, LINE_BOTTOM, paint);

        for (int i = 0; i < 7; i++) {
            int spacex = ((i + 1) * WIDTH) + (i * SPACE_X);
            int height = random.nextInt(LINE_BOTTOM);
            paint.setColor(Color.GREEN);
            RectF rectF1 = new RectF(110 + spacex, LINE_BOTTOM - height, 110 + spacex + WIDTH, LINE_BOTTOM);
            canvas.drawRect(rectF1, paint);
            paint.setColor(Color.WHITE);
            canvas.drawText("字:", 110 + spacex, LINE_BOTTOM + 10, paint);
        }
    }
}

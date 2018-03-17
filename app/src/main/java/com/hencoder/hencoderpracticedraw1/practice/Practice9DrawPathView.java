package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    Paint paint = new Paint();
    Path path = new Path();

    private void init() {
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);

        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        RectF arc = new RectF(20, 20, 40, 40);
        path.addArc(arc, -225, 225);
        RectF arc1 = new RectF(40, 20, 60, 40);
        path.arcTo(arc1, -180, 225, false);
        path.lineTo(40, 54);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        canvas.drawPath(path, paint);
        //把关键点绘制出来
        paint.setStrokeWidth(4);
        paint.setColor(Color.RED);
        canvas.drawPoint(20, 20, paint);

        paint.setColor(Color.BLUE);
        canvas.drawPoint(40, 40, paint);

        paint.setColor(Color.GREEN);
        canvas.drawPoint(40, 20, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawPoint(60, 40, paint);

        paint.setColor(Color.GRAY);
        canvas.drawPoint(40, 54, paint);
    }
}

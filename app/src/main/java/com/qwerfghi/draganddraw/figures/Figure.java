package com.qwerfghi.draganddraw.figures;

import android.graphics.Canvas;
import android.graphics.PointF;

public abstract class Figure {
    private int mColor;
    private float mThickness;
    private PointF mOrigin;
    private PointF mCurrent;

    public Figure(PointF origin, int color, float thickness) {
        mOrigin = origin;
        mCurrent = origin;
        mColor = color;
        mThickness = thickness;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public abstract void draw(Canvas canvas);

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public float getThickness() {
        return mThickness;
    }
}
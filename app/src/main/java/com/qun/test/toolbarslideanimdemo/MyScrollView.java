package com.qun.test.toolbarslideanimdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by Administrator on 2018/5/10 0010.
 */

public class MyScrollView extends ScrollView {
    private OnScrollListener mOnScrollListener;

    public MyScrollView(Context context) {
        super(context);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        mOnScrollListener = onScrollListener;
    }

    public interface OnScrollListener {
        void onScroll(ScrollView scrollView, int l, int t, int oldl, int oldt);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mOnScrollListener != null) {
            mOnScrollListener.onScroll(this, l, t, oldl, oldt);
        }

    }
}

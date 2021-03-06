package com.zego.wawaji_client;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Mark on 2016/3/15
 *
 * Des: 列表的分隔线.
 */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SpaceItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        if(parent.getChildPosition(view) != 0)
            outRect.top = space;
            outRect.bottom = space;

            if (parent.getChildLayoutPosition(view) == 0 || parent.getChildLayoutPosition(view) == 1){
                outRect.top = 0;
            }
    }
}

package com.godian.common.base.rv;

import android.util.SparseArray;
import android.view.View;

import androidx.annotation.IdRes;
import androidx.recyclerview.widget.RecyclerView;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/08/22
 *     desc  :
 * </pre>
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    private SparseArray<View> viewArray = new SparseArray<>();

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    @SuppressWarnings("unchecked")
    public <T extends View> T getView(@IdRes final int viewId) {
        View view = viewArray.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            viewArray.put(viewId, view);
        }
        return (T) view;
    }
}

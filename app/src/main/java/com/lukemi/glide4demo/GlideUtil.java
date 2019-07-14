package com.lukemi.glide4demo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.annotation.DrawableRes;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

/**
 * Glide Util
 */
public class GlideUtil {

    /**
     * @param context   上下文
     * @param url       地址
     * @param imageView 目标
     */
    public static void load(Context context, String url, ImageView imageView) {
        load(context, url, imageView, 0);
    }

    public static void load(Context context, String url, ImageView imageView, @DrawableRes int defaultDra) {
        load(context, url, imageView, defaultDra, defaultDra);
    }

    public static void load(Context context, String url, ImageView imageView, @DrawableRes int placeHolder, @DrawableRes int errorHolder) {
        load(context, url, imageView, placeHolder, errorHolder, false);

    }

    /**
     * @param context       上下文
     * @param url           图片地址
     * @param imageView     目标
     * @param placeHolder   占位图
     * @param errorHolder   错误站位图
     * @param dontAnimation 只否执行动画
     */
    public static void load(Context context, String url, ImageView imageView, @DrawableRes int placeHolder, @DrawableRes int errorHolder, boolean dontAnimation) {
        RequestBuilder<Drawable> builder = Glide.with(context)
                .load(url);
        if (dontAnimation) {
            builder.dontAnimate();
        }
        if (placeHolder != 0) {
            builder.placeholder(placeHolder);
        }
        if (errorHolder != 0) {
            builder.error(errorHolder);
        }
        builder.into(imageView);
    }
}

/*
 * Copyright (c) 2020 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.douya.util

fun <T : CharSequence> T.takeIfNotEmpty(): T? = if (isNotEmpty()) this else null
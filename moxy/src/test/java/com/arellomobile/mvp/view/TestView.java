package com.arellomobile.mvp.view;

import com.arellomobile.mvp.GenerateViewState;
import com.arellomobile.mvp.MvpView;

/**
 * Date: 08.02.2016
 * Time: 16:29
 *
 * @author Savin Mikhail
 */
@GenerateViewState
public interface TestView extends MvpView
{
	void testEvent();
}

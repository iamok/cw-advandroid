/***
	Copyright (c) 2008-2009 CommonsWare, LLC
	
	Licensed under the Apache License, Version 2.0 (the "License"); you may
	not use this file except in compliance with the License. You may obtain
	a copy of the License at
		http://www.apache.org/licenses/LICENSE-2.0
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/

package com.commonsware.android.database;

import android.test.ActivityInstrumentationTestCase;
import android.widget.ListView;
import android.widget.Spinner;

public class ContactsDemoTest
	extends ActivityInstrumentationTestCase<ContactsDemo> {
	private ListView list=null;
	private Spinner spinner=null;
	
	public ContactsDemoTest() {
		super("com.commonsware.android.database",
					ContactsDemo.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		ContactsDemo activity=getActivity();
		
		list=(ListView)activity.findViewById(android.R.id.list);
		spinner=(Spinner)activity.findViewById(R.id.spinner);
	}
	
	public void testSpinnerCount() {
		assertTrue(spinner.getAdapter().getCount()==3);
	}
	
	public void testListDefaultCount() {
		assertTrue(list.getAdapter().getCount()>0);
	}
}

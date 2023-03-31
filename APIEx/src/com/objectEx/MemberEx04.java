package com.objectEx;

public class MemberEx04 {
		private String id;
		private String name;
		
		public MemberEx04(String id, String name) {
			this.id = id;
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
		@Override
		public String toString() {
			return getId()+ ":" + getName();
			// = return this.id + ":"+ name;
		}
	}


/*
	실습 문제 2: javascript 파일
	작성자 : OOO 
           // 본인 이름 적어주세요
	작성일 : yyyy-mm-dd 
           // 오늘 날짜를 적어 주세요.
	스크립트 설명 :
	   실습2 에 해당하는 자바스크립트 파일입니다.
*/
		function showDiv(element){
		 	// 요구한 내용을 변수, 연산자, 제어문 등을 사용하여 실행되게 하세요.
		 	// 제목 체크시, titleBox 만 보여지게
		 	// 날짜 체크시, dateBox 만 보여지게
		 	// 작성자 체크시, writerBox 만 보여지게 함
			// hint : 선택한 요소의 체크여부는 속성 중 checked라는 속성을 이용하시면 됩니다.
			var visibleBox = element.value + 'Box';

			var unvibleBox1 = "";
			var unvibleBox2 = "";

			switch(element.value){
				case "title":
				unvibleBox1 = "dateBox";
				unvibleBox2 = "writerBox";
				break;
				case "date":
				unvibleBox1 = "titleBox";
				unvibleBox2 = "writerBox";
				break;
				case "writer":
				unvibleBox1 = "dateBox";
				unvibleBox2 = "titleBox";
				break;
			}

			document.getElementById(visibleBox).setAttribute("style", "display:");
			document.getElementById(unvibleBox1).setAttribute("style", "display:none");
			document.getElementById(unvibleBox2).setAttribute("style", "display:none");
		}

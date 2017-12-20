<html>
    <head>

        <title>Новогодний Тест </title>
		 <link href="css/bootstrap.min.css" rel="stylesheet">

    </head>


	<div class="container">
        <form action ="/result">
			 <h1>Тест поведения</h1>
				<h2>Привет! Ты хочешь узнать , хорошо ли ты вел себя в этом году?Тогда пройди тест и узнай свой результат.И возможно ты получишь подарок от самого Дедушки Мороза!<h2>


          <br>   <label for="name">Как тебя зовут? </label><br>
         <input type="text" class="form-control"  name="name" />
		 <p>
		 <br><label for="data">Введи свою дату рождения: </label><br>
            <input type="date" class="form-control" name="data" /> </p>

		  <p> <br><label  class="form-check-label" for="homework">Делаешь ли ты домашнее задание или работу по дому? </label><br></p>
		  <p>  <input type="radio" name="homework" value="yes"> Да<Br>
			<input type="radio" name="homework" value="no"> Нет<Br>
			<input type="radio" name="homework" value="partly"> Частично<Br></p>

			 <p> <br><label for="parents">Слушаешься ли ты своих родителей?</label><br></p>
		    <p><input type="radio" name="parents" value="yes"> Да<Br>
			<input type="radio" name="parents" value="no"> Нет<Br>
			<input type="radio" name="parents" value="partly"> Частично<Br></p>

			 <p> <br><label for="help">Помогаешь ли ты маме по дому?</label><br></p>
		  <p> <input type="radio" name="help" value="yes"> Да<Br>
			<input type="radio" name="help" value="no"> Нет<Br>
			<input type="radio" name="help" value="partly"> Частично<Br></p>

			<p> <br><label for="lie">Приходилось ли тебе врать своим родителям?</label><br></p>
		    <p>  <input type="radio" name="lie" value="no"> Да<Br>
			<input type="radio" name="lie" value="yes"> Нет<Br>
			<input type="radio" name="lie" value="partly"> Иногда<Br></p>

			<p> <br><label for="school">Хорошо ли ты ввел себя в школе?</label><br></p>
		    <p>  <input type="radio" name="school" value="yes"> Да,хорошо<Br>
			<input type="radio" name="school" value="no"> Нет,плохо<Br>
			<input type="radio" name="school" value="partly"> Не очень<Br></p>

			 <p> <br><label for="teacher">Слушаешься ли ты своих учителей?</label><br></p>
		    <p><input type="radio" name="teacher" value="yes"> Да<Br>
			<input type="radio" name="teacher" value="no"> Нет<Br>
			<input type="radio" name="teacher" value="partly"> Частично<Br></p>

			<p> <br><label for="marks">Хорошо ли ты закончил четверть?</label><br></p>
		    <p>  <input type="radio" name="marks" value="yes"> Да,хорошо<Br>
			<input type="radio" name="marks" value="no"> Нет,плохо<Br>
			<input type="radio" name="marks" value="partly"> Не очень,но я буду стараться<Br></p>

			<p> <br><label for="letter">Ты отправил Дедушке Морозу свое письмо?</label><br></p>
		  	<p> <input type="radio" name="letter" value="yes">Да,уже написал и отправил,жду ответа!<Br>
			<input type="radio" name="letter" value="no">Нет,зачем это делать?<Br>
			<input type="radio" name="letter" value="partly">Нет,но хочу написать и отправить!<Br></p>

				<p> <br><label for="force">Ты веришь в магическую силу Деда Мороза?</label><br></p>
		  	<p> <input type="radio" name="force" value="yes">Да<Br>
			<input type="radio" name="force" value="no">Нет<Br>
			<input type="radio" name="force" value="partly">Частично<Br></p>


			 <p> <br><label for="newyear">Как ты будешь вести себя в следущем году?</label><br></p>
		  <p> <input type="radio" name="newyear" value="yes"> Хорошо,Не подведу Дедушку Мороза! <Br>
			<input type="radio" name="newyear" value="no"> Так же как и всегда...<Br>
			<input type="radio" name="newyear" value="partly"> Я буду стараться вести себя хорошо лучше , чем в прошлом году!<Br></p>


		<p><input type="submit" value="Отправить" class="btn btn-primary btn-block"></p>
        </form>
		</div>
    </body>
</html>



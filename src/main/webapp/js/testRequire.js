define(['jquery'],function () {
	
	console.log('test requirejs');
	$('body').append('add by requiejs');
    return {
        getHello: function () {
            return 'Hello World';
        }
    };
});
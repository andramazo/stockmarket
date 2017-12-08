  google.load('search', '1', {language : 'en'});
  google.setOnLoadCallback(function() {
    var customSearchOptions = {};
  
    var imageSearchOptions = {};
    imageSearchOptions['layout'] = google.search.ImageSearch.LAYOUT_POPUP;
    customSearchOptions['enableImageSearch'] = true;
    customSearchOptions['imageSearchOptions'] = imageSearchOptions;
  
    var customSearchControl = new google.search.CustomSearchControl(
      '002205754253888090713:dkzbntjdolo', customSearchOptions);

    customSearchControl.setResultSetSize(google.search.Search.FILTERED_CSE_RESULTSET);
    var options = new google.search.DrawOptions();
    options.setAutoComplete(true);
    options.enableSearchboxOnly("http://www.faadooengineers.com/search-results.php", "s");
    customSearchControl.draw('cse-search-form', options);
  }, true);